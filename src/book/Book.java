/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package book;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;


public class Book {

    /**
     * @param args the command line arguments
     */
    static Cluster cluster;
    public static void main(String[] args) {
        
        cluster=Cluster.builder().addContactPoint("127.0.0.1").build();

        new login().setVisible(true);
    }
    
    public Session CassandraHelper()
        {
        //creating cluster object
        Session session=cluster.connect("books");
        return session;
        
    }
}
