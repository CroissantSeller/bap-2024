
package at.spengergasse.hawara;

import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.HostConfig;
import com.github.dockerjava.api.model.PortBinding;
import com.github.dockerjava.api.model.Ports;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;


@TestConfiguration(proxyBeanMethods = false)
public class TestContainerConfiguration {

    @Bean
    @ServiceConnection
    PostgreSQLContainer<?> postgreSQLContainer() {
        final Integer localPort = 12840;
        final Integer containerPort = 5432;
        return new PostgreSQLContainer<>(DockerImageName.parse("postgres:16-alpine"))
                .withDatabaseName("hawara")
                .withUsername("postgres")
                .withPassword("postgres")
                .withCreateContainerCmdModifier(cmd -> {
                    cmd.withName("TestHawaraApplication-postgres");
                    cmd.withHostConfig(new HostConfig()
                            .withPortBindings(
                                    new PortBinding(Ports.Binding.bindPort(localPort)
                                            ,new ExposedPort(containerPort))));
                })
                .withReuse(true);
    }
}
