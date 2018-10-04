package com.isa.patterns.builder.selfbounded;

import java.util.ArrayList;
import java.util.List;

public class ProfessionBuilders {

    /**
     * Static factory methods
     */
    public static EngineerBuilder newEngineer() {
        return new EngineerBuilder();
    }

    public static PilotBuilder newPilot() {
        return new PilotBuilder();
    }

    /**
     * Pilot Builder
     */
    static class PilotBuilder extends AbstractProfessionBuilder<PilotBuilder, Pilot> {

        private String language;

        public PilotBuilder language(String language) {
            this.language = language;
            return this;
        }

        @Override
        protected Pilot internalBuild() {
            return new Pilot(this.name, this.salary, this.duties, this.language);
        }
    }

    /**
     * Engineer Builder
     */
    static class EngineerBuilder extends AbstractProfessionBuilder<EngineerBuilder, Engineer> {

        private String tools;

        public EngineerBuilder tools(String tools) {
            this.tools = tools;
            return this;
        }

        @Override
        protected Engineer internalBuild() {
            return new Engineer(this.name, this.salary, this.duties, this.tools);
        }
    }

    abstract static class AbstractProfessionBuilder<SELF extends ProfessionBuilder<SELF, TTarget>,
            TTarget extends Profession> implements ProfessionBuilder<SELF, TTarget> {

        String name;

        double salary;

        List<String> duties = new ArrayList<>();

        @Override
        public SELF name(String name) {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }

            this.name = name;
            return self();
        }

        @Override
        public SELF salary(double salary) {
            if (salary < 0) {
                throw new IllegalArgumentException("Salary cannot be smaller than 0");
            }

            this.salary = salary;
            return self();
        }

        @Override
        public SELF duty(String duty) {
            if (duty == null || duty.isEmpty()) {
                throw new IllegalArgumentException("Duty cannot be empty");
            }

            duties.add(duty);
            return self();
        }

        public TTarget build() {
            return internalBuild();
        }

        protected abstract TTarget internalBuild();

        private SELF self() {
            return (SELF) this;
        }
    }
}
