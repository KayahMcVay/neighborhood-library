public class Book {

    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;


    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;

    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){

        return this.id;
    }


    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setIsCheckedOut(boolean isCheckedOut){
        this.isCheckedOut = isCheckedOut;
    }

    public boolean getIsCheckedOut(){
        return this.isCheckedOut;
    }

    public void setCheckedOutTo(String checkedOutTo){
        this.checkedOutTo = checkedOutTo;
    }

    public String getCheckedOutTo(){
        return checkedOutTo;
    }


   public void checkIn(){

       setIsCheckedOut(false);

       setCheckedOutTo(" ");

       System.out.println(getTitle() + " successfully checked in!");

    }

    public void checkOut(String userName){


        setIsCheckedOut(true);

        setCheckedOutTo(userName);

        System.out.println(getTitle() + " successfully checked out!");

    }


}

