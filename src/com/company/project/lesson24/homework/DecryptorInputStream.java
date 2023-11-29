package com.company.project.lesson24.homework;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecryptorInputStream extends FilterInputStream {
    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected DecryptorInputStream(InputStream in) {
        super(in);
    }
    public int read(int z)throws IOException {
        int c = super.read();
        if (c == -1)return -1;
        return (int)Math.pow(c, z);
    }
}
