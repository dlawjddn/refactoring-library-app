package com.group.libraryapp.dto.user.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserCreateRequest {
    private final String name;
    private final Integer age;
}
