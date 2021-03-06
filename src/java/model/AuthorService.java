
package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author joshuabrown
 */
public class AuthorService {
    
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
    
    
    public ArrayList getAllAuthors(){
    
    ArrayList<Author> authorsList = new ArrayList<Author>();
    
    authorsList.add(new Author(12,"Stephen King",date));
    authorsList.add(new Author(13,"Mark Twain",date));
    authorsList.add(new Author(14,"Paulo Coelho",date));
    
    return authorsList;
   }
}
