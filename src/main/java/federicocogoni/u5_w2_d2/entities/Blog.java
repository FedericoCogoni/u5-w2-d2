package federicocogoni.u5_w2_d2.entities;

    import lombok.*;

    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    public class Blog {

        private long id;
        private String category;
        private String title;
        private String cover;
        private String content;
        private int timeToRead;

    }

