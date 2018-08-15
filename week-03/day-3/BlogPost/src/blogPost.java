public class blogPost {

  String authorName;
  String title;
  String text;
  String publicationDate;

  public void blogs(){
    System.out.println("\"" + title + "\"" + " titled by " + authorName + " posted at " + publicationDate);
    System.out.println(text);
  }
}
