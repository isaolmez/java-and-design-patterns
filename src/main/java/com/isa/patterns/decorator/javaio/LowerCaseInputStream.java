package com.isa.patterns.decorator.javaio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int readByte = in.read();
        return readByte == -1 ? readByte : Character.toLowerCase((char) readByte);
    }

    @Override
    public int read(byte b[], int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = 0; i < result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }

        return result;
    }
}
