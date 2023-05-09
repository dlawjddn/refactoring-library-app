package com.group.libraryapp.dto.user.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
@Getter
@RequiredArgsConstructor
public class UserResponse {
    private final Long id;
    private final String name;
    private final Integer age;
}
