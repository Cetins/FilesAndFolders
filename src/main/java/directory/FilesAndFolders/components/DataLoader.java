package directory.FilesAndFolders.components;

import directory.FilesAndFolders.models.File;
import directory.FilesAndFolders.models.Folder;
import directory.FilesAndFolders.models.User;
import directory.FilesAndFolders.repositories.FileRepository;
import directory.FilesAndFolders.repositories.FolderRepository;
import directory.FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {
        Folder documents = new Folder("Documents");
        folderRepository.save(documents);

        Folder music = new Folder("Music");
        folderRepository.save(music);

        Folder photos = new Folder("Photos");
        folderRepository.save(photos);

        File javaLesson = new File("txt", 340, documents);
        fileRepository.save(javaLesson);

        File reactNotes = new File("docx", 910, documents);
        fileRepository.save(reactNotes);

        File projectUML = new File("png", 1780, documents);
        fileRepository.save(projectUML);

        File legendary = new File("mp3", 5890, music);
        fileRepository.save(legendary);

        File noGood = new File("mp3", 6250, music);
        fileRepository.save(noGood);

        File howlingForYou = new File("mp3", 4985, music);
        fileRepository.save(howlingForYou);

        File image_001 = new File("jpeg", 13800, photos);
        fileRepository.save(image_001);

        File image_002 = new File("jpeg", 10589, photos);
        fileRepository.save(image_002);

        File screenShoot = new File("png", 780, photos);
        fileRepository.save(screenShoot);

        User john = new User("John");
        userRepository.save(john);

        User jarrod = new User("Jarrod");
        userRepository.save(jarrod);

        john.addFolder(music);
        john.addFolder(documents);

        jarrod.addFolder(photos);
        jarrod.addFolder(documents);
    }
}
