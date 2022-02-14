package PaginationHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaginationHelper<I> {

    List<I> collection;
    int itemsPerPage;
    int pageCount;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;

        if (collection.size() % itemsPerPage == 0) {
            this.pageCount = collection.size() / itemsPerPage;
        } else {
            this.pageCount = collection.size() / itemsPerPage + 1;
        }

    }

    public int itemCount() {
        return collection.size();
    }

    public int pageCount() {
        return pageCount;
    }

    public int pageItemCount(int pageIndex) {
        if (pageIndex > pageCount-1) {
            return -1;
        }
        if (pageIndex < pageCount-1) {
            return itemsPerPage;
        } else {
            return collection.size() % itemsPerPage;
        }
    }

    public int pageIndex(int index) {
        if (collection.size() == 0 || index < 0) {
            return -1;
        }
        if (index == 0) {
            return 0;
        }
        if (index > collection.size()) {
            return -1;
        }
        if (index % itemsPerPage == 0) {
            return index / itemsPerPage - 1;
        } else {
            return index / itemsPerPage;
        }
    }

    public static void main(String[] args) {
        PaginationHelper<Character> helper = new PaginationHelper<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        System.out.println(helper.pageCount);
        System.out.println(helper.itemCount());
        System.out.println(helper.pageItemCount(0));
        System.out.println(helper.pageItemCount(1));
        System.out.println(helper.pageItemCount(2));
        System.out.println(helper.pageIndex(5));
        System.out.println(helper.pageIndex(2));
        System.out.println(helper.pageIndex(20));
        System.out.println(helper.pageIndex(0));
    }

}



