package at.spengergasse.hawara;

import at.spengergasse.hawara.domain.Email;
import at.spengergasse.hawara.domain.Password;
import at.spengergasse.hawara.domain.Users;
import at.spengergasse.hawara.domain.Username;
import at.spengergasse.hawara.persistence.UsersRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UsersRepositoryTest {

    private @Autowired UsersRepository userRepository;

    @Test
    public void saveUser() {
        // Given
        Username u = new Username("Kevin");
        Password p = new Password("password123");
        Email e = new Email("Kevin.test@example.com");

        Users users = Users.builder()
                .username(u)
                .password(p)
                .email(e)
                .build();

        // When
        Users savedUsers = userRepository.saveAndFlush(users);

        // Then
        assertThat(savedUsers.getId()).isNotNull();
        assertThat(savedUsers.getUsername().getUsername()).isEqualTo("Kevin"); // Access the username value
        assertThat(savedUsers.getPassword().getPassword()).isEqualTo("password123");
        assertThat(savedUsers.getEmail().getEmail()).isEqualTo("Kevin.test@example.com");
    }

    @Test
    public void findUsersById() {
        // Given
        Username u = new Username("Kevin");
        Password p = new Password("password123");
        Email e = new Email("Kevin.test@example.com");

        Users users = Users.builder()
                .username(u)
                .password(p)
                .email(e)
                .build();
        userRepository.saveAndFlush(users);

        // When
        assert users.getId() != null;
        Users foundUsers = userRepository.findById(users.getId()).orElse(null);

        // Then
        assertThat(foundUsers).isNotNull();
        assertThat(foundUsers.getId()).isNotNull();
        assertThat(foundUsers.getUsername().getUsername()).isEqualTo("Kevin"); // Access the username value
        assertThat(foundUsers.getPassword().getPassword()).isEqualTo("password123");
        assertThat(foundUsers.getEmail().getEmail()).isEqualTo("Kevin.test@example.com");
    }
}
