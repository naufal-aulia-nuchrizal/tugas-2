public class Member extends Visitor {
    public Member(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Member";
    }
}