package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class SetGuests {
 private Set<Guest> guests;

    public SetGuests() {
        this.guests = new HashSet<>() {
        };
    }
    public void addGuest(String name, int inviteCode) {
        this.guests.add(new Guest(name, inviteCode));
    }
    public void removeGuestByInviteCode(int inviteCode){
        if (!guests.isEmpty()) {
            guests.removeIf(g -> g.getInviteCode() == inviteCode);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    public void displayGuests() {
        System.out.println(guests);
    }
    public int countGuests() {
        return guests.size();
    }

    public static void main(String[] args) {
        SetGuests g = new SetGuests();
        g.addGuest("Ian", 10);
        g.addGuest("Marcia", 11);
        g.addGuest("Augusto", 5);
        g.addGuest("Romildo", 23);
        g.displayGuests();
        System.out.println(g.countGuests());
        g.removeGuestByInviteCode(5);
        g.displayGuests();
        System.out.println(g.countGuests());
    }
}
