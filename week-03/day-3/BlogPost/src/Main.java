public class Main {

  public static void main(String[] args) {
    blogPost one = new blogPost();
    one.authorName = "John Doe";
    one.title = "Lorem Ipsum";
    one.publicationDate = "2000.05.04";
    one.text = "Lorem ipsum dolor sit amet.";
    one.blogs();
    System.out.println();

    blogPost two = new blogPost();
    two.authorName = "Tim Urban";
    two.title = "Wait but why";
    two.publicationDate = "2010.10.10.";
    two.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

    blogPost three = new blogPost();
    three.authorName = "William Turton";
    three.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    three.publicationDate = "2017.03.28.";
    three.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
    three.blogs();
    System.out.println();
  }
}
