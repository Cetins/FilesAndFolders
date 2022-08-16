package directory.FilesAndFolders.repositories;

import directory.FilesAndFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
