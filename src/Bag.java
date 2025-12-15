public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) {
        this(amount, null);
    }

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    //초대장 소유 여부
    public boolean hasInvitation() {
        return invitation != null;
    }

    //티켓 소유 여부
    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    //현금 감소
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }
    //현금 증가
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
    public Long hold(Ticket ticket) {
        if(hasInvitation()) {
            setTicket(ticket);
            return 0L;
        }else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
