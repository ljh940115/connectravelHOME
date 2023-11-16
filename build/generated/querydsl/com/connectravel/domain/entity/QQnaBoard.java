package com.connectravel.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQnaBoard is a Querydsl query type for QnaBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQnaBoard extends EntityPathBase<QnaBoard> {

    private static final long serialVersionUID = -691514656L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQnaBoard qnaBoard = new QQnaBoard("qnaBoard");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final QMember member;

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modTime = _super.modTime;

    public final NumberPath<Long> qbno = createNumber("qbno", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regTime = _super.regTime;

    public final ListPath<QnaReply, QQnaReply> replies = this.<QnaReply, QQnaReply>createList("replies", QnaReply.class, QQnaReply.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public QQnaBoard(String variable) {
        this(QnaBoard.class, forVariable(variable), INITS);
    }

    public QQnaBoard(Path<? extends QnaBoard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQnaBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQnaBoard(PathMetadata metadata, PathInits inits) {
        this(QnaBoard.class, metadata, inits);
    }

    public QQnaBoard(Class<? extends QnaBoard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}

