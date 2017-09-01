package pro;

public class beans1 {
  int id;
 String title;
  String author;
 int songs_albumidentifier;
public beans1(int id, String title, String author, int songs_albumidentifier) {
	super();
	this.id = id;
	this.title = title;
	this.author = author;
	this.songs_albumidentifier = songs_albumidentifier;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getSongs_albumidentifier() {
	return songs_albumidentifier;
}
public void setSongs_albumidentifier(int songs_albumidentifier) {
	this.songs_albumidentifier = songs_albumidentifier;
}
 
 
}
