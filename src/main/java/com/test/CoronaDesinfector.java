package com.test;

public class CoronaDesinfector {
    private Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

    public void start(Room room) {
        announcer.announce("Начинаем дезинфекцию, все вон!");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("Можете рискнуть зайти обратно в комнату");
    }

    private void desinfect(Room room) {
        System.out.println("ЗАЧИТЫВАЕТСЯ МОЛИТВА: 'корона изыди!' - молитва прочитана, вирус низвергнут в ад");
    }
}
