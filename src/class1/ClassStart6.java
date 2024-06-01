package class1;

public class ClassStart6 {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        System.out.println("영화 제목: " + movieReview1.title + ", 리뷰: " + movieReview1.review);
        System.out.println("영화 제목: " + movieReview2.title + ", 리뷰: " + movieReview2.review);

        MovieReview[] movieReviews = {movieReview1, movieReview2};

        for (int i = 0; i < movieReviews.length; i++) {
            System.out.println("영화 제목: " + movieReviews[i].title + ", 리뷰: " + movieReviews[i].review);
        }

        for(int i = 0; i < movieReviews.length; i++) {
            MovieReview m = movieReviews[i];

            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }

        for(MovieReview m: movieReviews) {
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }
    }
}
