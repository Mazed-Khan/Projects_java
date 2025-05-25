
public class Member {
    private String memberId;
    private String memeberName;

    public Member(String memberId, String memberName) {
        this.memberId = memberId;
        this.memeberName = memberName;
    }
    public String getMemberId() {
        return memberId;
    }
    public String getMemeberName() {
        return memeberName;
    }

    //Display Method
    public void displayInfo(){
        System.out.println("Member id:"+ memberId +" name:"+ memeberName);
    }


}

