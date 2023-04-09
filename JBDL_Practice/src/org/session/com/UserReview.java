package org.session.com;

import java.util.Comparator;

public class UserReview implements Comparator<Review> {
    @Override
    public int compare(Review o1, Review o2) {
        return o1.criticReview-o2.criticReview;
    }
}
