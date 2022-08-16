package directory.FilesAndFolders.repositories;

import directory.FilesAndFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
