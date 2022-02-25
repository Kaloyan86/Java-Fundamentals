package ObjectAndClasses;

import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(", ");
        String title = data[0];
        String content = data[1];
        String author = data[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split(": ");
            switch (commands[0]) {
                case "Edit":
                    article.setContent(commands[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(commands[1]);
                    break;
                case "Rename":
                    article.setTitle(commands[1]);
                    break;
            }
        }
        System.out.println(article.toString());
    }

    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            // "{title} - {content}: {author}"
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }
}
