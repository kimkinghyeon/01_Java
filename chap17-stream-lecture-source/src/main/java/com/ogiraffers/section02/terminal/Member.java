<<<<<<< HEAD
package com.ogiraffers.section02.terminal;

public class Member {
    private String memberId;
    private String memberName;

    public Member() {
    }

    public Member(String memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                '}';
    }
=======
package com.ogiraffers.section02.terminal;public class Member {
>>>>>>> c865fb1d7ff669dec49004731169a22c0b91063e
}
