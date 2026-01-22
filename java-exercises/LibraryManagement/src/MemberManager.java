import java.util.ArrayList;

public class MemberManager {

    ArrayList<Member> members = new ArrayList<>();

    MemberManager(){
    }

    void addMember(String name){
        members.add(new Member(name));
    }

    void listMembers(){
        int i = 0;
        for(Member member : members){
            i++;
            System.out.println(i + " - " + member);
        }
    }

    Member getMemberByIndex(int choiceMember){
        if(choiceMember <= 0 || choiceMember > members.size()){
            System.out.println("Invalid option.");
        }
        else {
            choiceMember--;
            return members.get(choiceMember);
        }
        return null;
    }
}
