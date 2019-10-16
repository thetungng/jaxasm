package example.Entity.DTO;

import example.Entity.Member;

public class MemberDTO {
    private String id;
    private String name;
    private String username;
    private String password;

    public MemberDTO() {
    }

    public MemberDTO(Member member) {
        this.id = String.valueOf(member.getId());
        this.name = member.getName();
        this.username = member.getUsername();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
