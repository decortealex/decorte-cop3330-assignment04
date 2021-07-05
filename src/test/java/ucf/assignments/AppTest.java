package ucf.assignments;

import org.junit.jupiter.api.Test;

public class AppTest {
    todoList testList;
    todoItem testItem;

    // Tests for todoList Class
    @Test
    void testPopItem() {
        // testList = new todoList()
        // testItem = new todoItem()
        // testList.add(testItem)
        // assertEquals(true, popItem(testItem))
    }

    @Test
    void testGetItem() {
        // testList = new todoList()
        // testItem = new todoItem()
        // testList.addItem(testItem)
        // assertEquals(testItem, testList.getItem(0))
    }

    @Test
    void testClearAllItems() {
        // testList = new todoList()
        // testItem = new todoItem()
        // testList.addItem(testItem)
        // testList.clearAllItems()
        // AssertEquals(0, testList.getSize())
    }

    @Test
    void testGetSize() {
        // testList = new todoList()
        // testItem = new todoItem()
        // testList.addItem(testItem)
        // AssertEquals(1, testList.getSize())

    } // END of todoList class


    // Tests for todoItem class
    @Test
    void testGetItemTitle() {
        // testItem = new todoItem(itemTitle = "test")
        // AssertEquals("test", testItem.getItemTitle())
    }

    @Test
    void testSetItemTitle() {
        // testItem = new todoItem(itemTitle = "test")
        // testItem.setItemTitle("best")
        // AssertEquals("best", testItem.getItemTitle())
    }

    @Test
    void testGetDesc() {
        // testItem = new todoItem(desc = "sampleDesc")
        // AssertEquals("sampleDesc", testItem.getDesc())
    }

    @Test
    void testSetDesc() {
        // testItem = new todoItem(desc = "sampleDesc")
        // testItem.setDesc("new desc")
        // AssertEquals("new desc", testItem.getDesc())
    }

    @Test
    void testGetDueDate() {
        // test_date = "1984-04-01"
        // testItem = new todoItem(dueDate = test_date)
        // AssertEquals(test_date, testItem.getDueDate())
    }

    @Test
    void testSetDueDate() {
        // test_date = "1984-04-01"
        // testItem = new todoItem(dueDate = "2002-03-25")
        // testItem.setDueDate(test_date)
        // AssertEquals(test_date, testItem.getDueDate())
    }

    @Test
    void testSetDone() {
        // testItem = new todoItem()
        // testItem.setDone(true)
        // AssertEquals(true, testItem.isItemComplete())

    } // END of todoItem class

}
