package com.pactera.minicoding.stage2;

import com.pactera.minicoding.stage2.pupil.Pupil;

/**
 * @ClassName PupilQueue
 * @Description  Builder Pattern
 * @Author Elson.Lai
 * @Date 19-6-17 11:14 PM
 * @ModifyDate 19-6-17 11:18 PM
 * @Version 1.0
 */
public class PupilQueue {

    private final Pupil pupil;

    private final int startNumber;

    private final int endNumber;

    private final String separator;

    public static class Builder {

        private Pupil pupil;

        private int startNumber;

        private int endNumber;

        private final String separator;

        private Builder(String separator) {
            this.separator=separator;
        }

        public static Builder custom(String separator){
            return new Builder(separator);
        }

        public Builder setPupil(Pupil pupil) {
            this.pupil = pupil;
            return this;
        }

        public Builder setStartNumber(int startNumber) {
            this.startNumber = startNumber;
            return this;
        }

        public Builder setEndNumber(int endNumber) {
            this.endNumber = endNumber;
            return this;
        }

        public PupilQueue build() {
            return new PupilQueue(this);
        }
    }

    /**
     * private constructor of pupilQueue
     * @param builder Builder as its input parameter
     */
    private PupilQueue(Builder builder) {
        this.pupil = builder.pupil;
        this.startNumber = builder.startNumber;
        this.endNumber = builder.endNumber;
        this.separator= builder.separator;
    }

    /**
     * show what pupil say
     * @return what pupil say as string type
     */
    public String say() {
        StringBuilder result = new StringBuilder();
        for (int i = startNumber; i <= endNumber; i++) {
            String content = pupil.say(i);
            if (content != null) {
                result.append(content).append(separator);
            }
        }
        return result.toString();
    }
}
