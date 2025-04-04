class Member {
    private String phoneNo;
    private String email;

    public Member(String phoneNo, String email) {
        this.phoneNo = phoneNo;
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
            " phoneNo='" + phoneNo + "'" +
            ", email='" + email + "'" +
            "}";
    }


    
}
