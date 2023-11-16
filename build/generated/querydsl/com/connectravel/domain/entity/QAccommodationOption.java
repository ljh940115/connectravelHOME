package com.connectravel.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAccommodationOption is a Querydsl query type for AccommodationOption
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAccommodationOption extends EntityPathBase<AccommodationOption> {

    private static final long serialVersionUID = -1886160599L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAccommodationOption accommodationOption = new QAccommodationOption("accommodationOption");

    public final QAccommodation accommodation;

    public final NumberPath<Long> aono = createNumber("aono", Long.class);

    public final QOption option;

    public QAccommodationOption(String variable) {
        this(AccommodationOption.class, forVariable(variable), INITS);
    }

    public QAccommodationOption(Path<? extends AccommodationOption> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAccommodationOption(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAccommodationOption(PathMetadata metadata, PathInits inits) {
        this(AccommodationOption.class, metadata, inits);
    }

    public QAccommodationOption(Class<? extends AccommodationOption> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.accommodation = inits.isInitialized("accommodation") ? new QAccommodation(forProperty("accommodation"), inits.get("accommodation")) : null;
        this.option = inits.isInitialized("option") ? new QOption(forProperty("option")) : null;
    }

}

