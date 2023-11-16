package com.connectravel.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAccommodation is a Querydsl query type for Accommodation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAccommodation extends EntityPathBase<Accommodation> {

    private static final long serialVersionUID = -1936194668L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAccommodation accommodation = new QAccommodation("accommodation");

    public final StringPath accommodationName = createString("accommodationName");

    public final ListPath<AccommodationOption, QAccommodationOption> accommodationOptions = this.<AccommodationOption, QAccommodationOption>createList("accommodationOptions", AccommodationOption.class, QAccommodationOption.class, PathInits.DIRECT2);

    public final StringPath accommodationType = createString("accommodationType");

    public final StringPath address = createString("address");

    public final NumberPath<Long> ano = createNumber("ano", Long.class);

    public final StringPath content = createString("content");

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final NumberPath<Double> grade = createNumber("grade", Double.class);

    public final ListPath<AccommodationImg, QAccommodationImg> images = this.<AccommodationImg, QAccommodationImg>createList("images", AccommodationImg.class, QAccommodationImg.class, PathInits.DIRECT2);

    public final StringPath intro = createString("intro");

    public final QMember member;

    public final NumberPath<Integer> postal = createNumber("postal", Integer.class);

    public final StringPath region = createString("region");

    public final NumberPath<Integer> reviewCount = createNumber("reviewCount", Integer.class);

    public final ListPath<Room, QRoom> rooms = this.<Room, QRoom>createList("rooms", Room.class, QRoom.class, PathInits.DIRECT2);

    public final StringPath sellerEmail = createString("sellerEmail");

    public final StringPath sellerName = createString("sellerName");

    public final StringPath tel = createString("tel");

    public QAccommodation(String variable) {
        this(Accommodation.class, forVariable(variable), INITS);
    }

    public QAccommodation(Path<? extends Accommodation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAccommodation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAccommodation(PathMetadata metadata, PathInits inits) {
        this(Accommodation.class, metadata, inits);
    }

    public QAccommodation(Class<? extends Accommodation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}

