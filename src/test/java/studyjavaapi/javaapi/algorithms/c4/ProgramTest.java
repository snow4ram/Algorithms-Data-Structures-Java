package studyjavaapi.javaapi.algorithms.c4;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.Checksum;


@Slf4j
class ProgramTest {

    @Test
    @DisplayName("문자열 My text 에 대한 CRC32 체크섬 값을 계산하고 출력합니다.")
    public void input1() {

        Program program = new Program("My text");

        byte[] bytes = program.getInput().getBytes();

        CRC32 crc32 = new CRC32();

        crc32.update(bytes);

        log.info("CRC32 Input Value 1 = {}", crc32.getValue());

        crc32.reset();

        Assertions.assertThat(crc32.getValue()).isEqualTo(0);
    }


    @Test
    @DisplayName("문자열 Why use it? 에 대한 CRC32 체크섬 값을 계산하고 출력합니다.")
    public void input2() {

        Program program = new Program("Why use it");

        byte[] bytes = program.getInput().getBytes();

        CRC32 crc32 = new CRC32();

        crc32.update(bytes);

        log.info("CRC32 Input Value 2 = {}", crc32.getValue());

        crc32.reset();

        Assertions.assertThat(crc32.getValue()).isEqualTo(0);
    }

    @Test
    @DisplayName("문자열 My different text 에 대한 CRC32 체크섬 값을 계산하고 출력합니다.")
    public void input3() {

        Program program = new Program("My different text");

        byte[] bytes = program.getInput().getBytes();

        CRC32 crc32 = new CRC32();

        crc32.update(bytes);

        log.info("CRC32 Input Value 3 = {}", crc32.getValue());

        crc32.reset();

        Assertions.assertThat(crc32.getValue()).isEqualTo(0);
    }


    @Test
    public void input4() {

        Checksum checksum = new CRC32();

        checksum.update(ByteBuffer.allocate(4).putInt(148595460).array(),0,4);

        log.info("checksum = {}", checksum.getValue());

    }

    @Test
    public void input5() {
        Program program = new Program("148595460");

        Checksum checksum = new CRC32();

        int length = program.getInput().length();

        checksum.update(program.getInput().getBytes(),0,length);

        log.info("checksum = {}", checksum.getValue());
    }
}