package IO;

import java.nio.file.FileAlreadyExistsException;

/**
 * Интерфейс копирования файлов
 * 
 * @author nedis
 * @version 1.0
 */
public interface Utils {
	
	/**
	 * Функция копирования файла source в файл destination. Source и destination - это пути к файлам
	 * 
	 * @param source путь к исходному файлу
	 * @param destination путь к целевому файлу
	 * @throws FileAlreadyExistsException если целевой файл уже существует
	 * @throws FailedException если произошла какая-нибудь ошибка при копировании файлов, в cause следует указать источник ошибки
	 */
	void copyFile(String source, String destination) throws FailedException, FileAlreadyExistsException;
}
