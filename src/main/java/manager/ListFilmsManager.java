package manager;
import domain.ListFilms;

public class ListFilmsManager {
    private ListFilms[] playbill = new ListFilms[0];
    private int limit;

    public ListFilmsManager() {
        limit = 7;
    }

    public ListFilmsManager(int limit) {
        this.limit = limit;
    }


    public void add(ListFilms item) {
        int length = playbill.length + 1;
        ListFilms[] tmp = new ListFilms[length];
        System.arraycopy(playbill, 0, tmp, 0, playbill.length);


        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        playbill = tmp;

    }

    public ListFilms[] findLast() {
        ListFilms[] playbill = findAll();
        ListFilms[] result;
        if (limit < playbill.length) {
            result = new ListFilms[limit];
        } else {
            result = new ListFilms[playbill.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = playbill.length - i - 1;
            result[i] = playbill[index];
        }
        return result;
    }

    public ListFilms[] findAll() {
        return playbill;
    }

}