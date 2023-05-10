package com.group.libraryapp.domain.user.loanhistory;

import com.group.libraryapp.domain.user.User;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class UserLoanHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    private String bookName;
    private boolean isReturn;
    protected UserLoanHistory(){}

    public UserLoanHistory(User user, String bookName) {
        this.user = user;
        this.bookName = bookName;
    }
    public void doReturn() {
        this.isReturn=true;
    }
}
