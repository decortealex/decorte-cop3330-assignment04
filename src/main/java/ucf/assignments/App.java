/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 4 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */

package ucf.assignments;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class App {
}

class todoList {
    private String title;
    private ArrayList<todoItem> items;

    public todoList() {
        /*
        this.title = param title;
        items = new Arraylist<todoItem>;
         */
    }

    /**
     * appends item to todo list
     * @param item item to add
     */
    public void addItem(todoItem item) {
        // items.add(item)
    }

    /**
     * removes item from todo list
     * @param item item to remove
     * @return true if successful
     */
    public boolean popItem(todoItem item) {
        //return items.remove(item)
        return false;
    }

    /**
     * get item from todo list by index
     * @param index index to get
     * @return todoItem object
     */
    public todoItem getItem(int index) {
        //return items.get(index)
        return new todoItem("s", "s", "s");
    }

    public void clearAllItems() {
        //items.clear()
    }

    public int getSize() {
        //return items.size()
        return 0;
    }

    /**
     * prints item at index
     * @param index index to be printed
     */
    public void printItem(int index) {
        // todoItem = items.get(index)
        // print(todoItem)
    }

    /**
     * prints all items in list
     */
    public void printAllItems() {
        // for item in items
        // print(item)
    }
}

class todoItem {
    String itemTitle;
    String desc;
    Date dueDate;
    SimpleDateFormat sdf;
    boolean isComplete;

    // constructor params will be class variables
    public todoItem(String itemTitle, String desc, String dueDate) {
        // this.itemTitle = itemTitle
        // this.desc = desc
        // this.sdf = new SDF(YYYY-MM-DD)
        // this.dueDate = sdf.parse(dueDate)
        //this.isComplete = false

    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String title) {
        // this.itemTitle = title
    }

    public String getDesc() {

        return desc;
    }

    public void setDesc(String desc) {
        // this.desc = desc
    }

    public String getDueDate() {
        // return date.toString
        return "dueDate";
    }

    public void setDueDate(String date) {
        // this.date = sdf.parse(date)
    }

    public boolean isItemComplete() {
        return isComplete;
    }

    public void setDone(boolean isDone) {
        // this.isComplete = isDone
    }
}
