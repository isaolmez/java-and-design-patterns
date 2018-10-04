package com.isa.patterns.builder.inherited;

import java.util.ArrayList;
import java.util.List;

public class ProfessionBuilders {

    /**
     * Static factory methods
     */
    public static ProfessionBuilder<Engineer> newEngineer() {
        return new EngineerBuilder();
    }

    public static ProfessionBuilder<Pilot> newPilot() {
        return new PilotBuilder();
    }

    /**
     * Pilot Builder
     */
    static class PilotBuilder extends AbstractProfessionBuilder<Pilot> {

        @Override
        protected Pilot internalBuild() {
            return new Pilot(this.name, this.salary, this.duties);
        }
    }

    /**
     * Engineer Builder
     */
    static class EngineerBuilder extends AbstractProfessionBuilder<Engineer> {

        @Override
        protected Engineer internalBuild() {
            return new Engineer(this.name, this.salary, this.duties);
        }
    }

    abstract static class AbstractProfessionBuilder<T extends Profession> implements ProfessionBuilder<T> {

        String name;

        double salary;

        List<String> duties = new ArrayList<>();

        @Override
        public ProfessionBuilder<T> name(String name) {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }

            this.name = name;
            return this;
        }

        @Override
        public ProfessionBuilder<T> salary(double salary) {
            if (salary < 0) {
                throw new IllegalArgumentException("Salary cannot be smaller than 0");
            }

            this.salary = salary;
            return this;
        }

        @Override
        public ProfessionBuilder<T> duty(String duty) {
            if (duty == null || duty.isEmpty()) {
                throw new IllegalArgumentException("Duty cannot be empty");
            }

            duties.add(duty);
            return this;
        }

        public T build() {
            return internalBuild();
        }

        protected abstract T internalBuild();
    }
}
