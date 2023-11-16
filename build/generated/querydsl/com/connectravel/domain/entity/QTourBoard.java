package com.connectravel.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTourBoard is a Querydsl query type for TourBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTourBoard extends EntityPathBase<TourBoard> {

    private static final long serialVersionUID = -1738424400L;

    public static final QTourBoard tourBoard = new QTourBoard("tourBoard");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath address = createString("address");

    public final StringPath category = createString("category");

    public final StringPath content = createString("content");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Double> grade = createNumber("grade", Double.class);

    public final ListPath<TourBoardImg, QTourBoardImg> images = this.<TourBoardImg, QTourBoardImg>createList("images", TourBoardImg.class, QTourBoardImg.class, PathInits.DIRECT2);

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modTime = _super.modTime;

    public final NumberPath<Integer> postal = createNumber("postal", Integer.class);

    public final StringPath region = createString("region");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regTime = _super.regTime;

    public final NumberPath<Integer> reviewCount = createNumber("reviewCount", Integer.class);

    public final ListPath<TourBoardReview, QTourBoardReview> reviews = this.<TourBoardReview, QTourBoardReview>createList("reviews", TourBoardReview.class, QTourBoardReview.class, PathInits.DIRECT2);

    public final NumberPath<Long> tbno = createNumber("tbno", Long.class);

    public final StringPath title = createString("title");

    public QTourBoard(String variable) {
        super(TourBoard.class, forVariable(variable));
    }

    public QTourBoard(Path<? extends TourBoard> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTourBoard(PathMetadata metadata) {
        super(TourBoard.class, metadata);
    }

}

