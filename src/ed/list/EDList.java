/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.list;

/**
 *
 * @author Dell
 */
public class EDList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CList CircleList = new CList(5);
        CircleList.insert(7);
        CircleList.showList();
        CircleList.insert(9);
        CircleList.showList();
        CircleList.deleteNode(9);
        CircleList.showList();
        CircleList.deleteList();
        CircleList.showList();
        CircleList.showListbyAddress();
    }
    
}
