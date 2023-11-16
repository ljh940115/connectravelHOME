package com.connectravel.domain.entity.check;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChatConfigEntity is a Querydsl query type for ChatConfigEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChatConfigEntity extends EntityPathBase<ChatConfigEntity> {

    private static final long serialVersionUID = 193416289L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChatConfigEntity chatConfigEntity = new QChatConfigEntity("chatConfigEntity");

    public final com.connectravel.domain.entity.chat.QChatRoom chatRoom;

    public final DateTimePath<java.time.LocalDateTime> configTime = createDateTime("configTime", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.connectravel.domain.entity.QMember user;

    public QChatConfigEntity(String variable) {
        this(ChatConfigEntity.class, forVariable(variable), INITS);
    }

    public QChatConfigEntity(Path<? extends ChatConfigEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChatConfigEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChatConfigEntity(PathMetadata metadata, PathInits inits) {
        this(ChatConfigEntity.class, metadata, inits);
    }

    public QChatConfigEntity(Class<? extends ChatConfigEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.chatRoom = inits.isInitialized("chatRoom") ? new com.connectravel.domain.entity.chat.QChatRoom(forProperty("chatRoom"), inits.get("chatRoom")) : null;
        this.user = inits.isInitialized("user") ? new com.connectravel.domain.entity.QMember(forProperty("user")) : null;
    }

}

