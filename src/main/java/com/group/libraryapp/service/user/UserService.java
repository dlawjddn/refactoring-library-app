package com.group.libraryapp.service.user;

import com.group.libraryapp.domain.user.User;
import com.group.libraryapp.domain.user.UserRepository;
import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserUpdateRequest;
import com.group.libraryapp.dto.user.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    @Transactional
    public void saveUser(UserCreateRequest request){
        userRepository.save(new User(request.getName(), request.getAge()));
    }
    @Transactional(readOnly = true)
    public List<UserResponse> getUsers(){
        List<User> users = userRepository.findAll();
        return users.stream().map(user -> new UserResponse(user.getId(), user.getName(), user.getAge()))
                .collect(Collectors.toList());
    }
    @Transactional
    public void updateUser(UserUpdateRequest request){
        User findUser = userRepository.findById(request.getId())
                .orElseThrow(IllegalArgumentException::new);
        findUser.updateName(request.getName());
        userRepository.save(findUser);
    }
    @Transactional
    public void deleteUser(String name){
        User user = userRepository.findByName(name)
                .orElseThrow(IllegalArgumentException::new);
        userRepository.delete(user);
    }
}
