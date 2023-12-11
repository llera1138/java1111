package manager;
import domain.ListFilms;

public class Main {

    public static void main(String[] args) {

        ListFilms film1 = new ListFilms(101, 1, "Бладшот - Начало.", 500, 2);
        ListFilms film2 = new ListFilms(102, 2, "Вперёд", 500, 2);
        ListFilms film3 = new ListFilms(103, 3, "Отель Белград", 500, 2);
        ListFilms film4 = new ListFilms(104, 4, "Джентльмены", 700, 2);
        ListFilms film5 = new ListFilms(105, 5, "Человек-неведимка", 300, 2);
        ListFilms film6 = new ListFilms(106, 6, "Тролли.Мировой тур", 500, 6);
        ListFilms film7 = new ListFilms(107, 7, "Номер один", 500, 1);

        ListFilmsManager manager = new ListFilmsManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        ListFilms[] all = manager.findLast();

    }

}