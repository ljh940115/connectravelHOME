package com.connectravel.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAccessIp is a Querydsl query type for AccessIp
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAccessIp extends EntityPathBase<AccessIp> {

    private static final long serialVersionUID = 405401897L;

    public static final QAccessIp accessIp = new QAccessIp("accessIp");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ipAddress = createString("ipAddress");

    public QAccessIp(String variable) {
        super(AccessIp.class, forVariable(variable));
    }

    public QAccessIp(Path<? extends AccessIp> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAccessIp(PathMetadata metadata) {
        super(AccessIp.class, metadata);
    }

}

