package org.session.com;

public class Review implements Comparable<Review> {
    int criticReview;
    int userReview;

    public Review(int criticReview, int userReview) {
        this.criticReview = criticReview;
        this.userReview = userReview;
    }

    @Override
    public int compareTo(Review o) {
        return this.userReview-o.userReview;
    }
}
