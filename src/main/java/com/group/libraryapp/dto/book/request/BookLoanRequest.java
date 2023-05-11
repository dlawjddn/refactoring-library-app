package com.group.libraryapp.dto.book.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BookLoanRequest {
    private final String userName;
    private final String bookName;
}
