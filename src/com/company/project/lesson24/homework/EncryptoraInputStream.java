package com.company.project.lesson24.homework;

import java.io.*;

public class EncryptoraInputStream extends FilterOutputStream {


    /**
     * Creates an output stream filter built on top of the specified
     * underlying output stream.
     *
     * @param out the underlying output stream to be assigned to
     *            the field {@code this.out} for later use, or
     *            {@code null} if this instance is to be
     *            created without an underlying stream.
     */
    public EncryptoraInputStream(OutputStream out) {
        super(out);
    }

    public void write(int c, int z) throws IOException {
        super.write((int)Math.pow(c,z));
    }
}
