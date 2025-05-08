package com.diet_info.dietInfo;

import com.diet_info.dietInfo.user.exceptions.UserNotFoundException;
import com.diet_info.dietInfo.user.model.User;
import com.diet_info.dietInfo.user.model.UserDTO;
import com.diet_info.dietInfo.user.repository.UserRepository;
import com.diet_info.dietInfo.user.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.awt.geom.RectangularShape;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class DeleteUserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void given_user_exists_when_delete_user_service_return_void() {

        User user = new User();
        user.setId(1);
        user.setUsername("senhorcafe");
        user.setPassword("<PASSWORD>");
        user.setWeight(70.0);
        user.setHeight(1.75);

        when(userRepository.findById(1)).thenReturn(Optional.of(user));

        ResponseEntity<Void> responseEntity = userService.deleteUsers(1);

        assertEquals(ResponseEntity.status(HttpStatus.NO_CONTENT).build(), responseEntity);
        verify(userRepository, times(1)).findById(1);
    }

    @Test
    public void given_user_does_not_exist_when_delete_user_service_throw_new_user_not_found_exception() {
        when(userRepository.findById(1)).thenReturn(Optional.empty());

        assertThrows(UserNotFoundException.class, () -> userService.deleteUsers(1));
        verify(userRepository, times(1)).findById(1);
    }
}
