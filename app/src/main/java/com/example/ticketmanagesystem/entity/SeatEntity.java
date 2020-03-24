package com.example.ticketmanagesystem.entity;

import java.util.List;

public class SeatEntity {
    /**
     * columnsField : [{"codeField":"A","descriptionField":1},{"codeField":"C","descriptionField":1},{"codeField":"走道","descriptionField":2},{"codeField":"走道","descriptionField":2},{"codeField":"D","descriptionField":1},{"codeField":"F","descriptionField":1},{"codeField":"G","descriptionField":1},{"codeField":"H","descriptionField":1},{"codeField":"走道","descriptionField":2},{"codeField":"走道","descriptionField":2},{"codeField":"J","descriptionField":1},{"codeField":"L","descriptionField":1}]
     * defaultSeatAvailField : true
     * rowEndNumberField : 78
     * rowStartNumberField : 31
     * rowsField : [{"characteristicsField":"","codeField":31,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":"X"}]},{"characteristicsField":"","codeField":32,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":"$"}]},{"characteristicsField":"","codeField":33,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":"$"}]},{"characteristicsField":"","codeField":34,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":"$"}]},{"characteristicsField":"","codeField":35,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":"$"}]},{"characteristicsField":"","codeField":36,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":"$"}]},{"characteristicsField":"","codeField":37,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":"$"}]},{"characteristicsField":"","codeField":38,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":"$"}]},{"characteristicsField":"","codeField":39,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":"$"}]},{"characteristicsField":"","codeField":40,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":"$"}]},{"characteristicsField":"","codeField":41,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"!"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"!"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"!"},{"codeField":"F","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"G","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"H","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"!"},{"codeField":"L","isAvailField":true,"seatCharacteristicsField":"*"}]},{"characteristicsField":"","codeField":42,"seatsField":[{"codeField":"A","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"C","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"!"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"!"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":"!"},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"!"},{"codeField":"J","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"L","isAvailField":true,"seatCharacteristicsField":"*"}]},{"characteristicsField":"","codeField":43,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":"X"}]},{"characteristicsField":"","codeField":61,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":"$"},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":"$"}]},{"characteristicsField":"","codeField":62,"seatsField":[{"codeField":"A","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"C","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"D","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"F","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"G","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"H","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"!"},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":"!"}]},{"characteristicsField":"","codeField":63,"seatsField":[{"codeField":"A","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"C","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"D","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"F","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"G","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"H","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"J","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"L","isAvailField":true,"seatCharacteristicsField":"*"}]},{"characteristicsField":"","codeField":64,"seatsField":[{"codeField":"A","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"C","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"D","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"F","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"G","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"H","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"J","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"L","isAvailField":true,"seatCharacteristicsField":"*"}]},{"characteristicsField":"","codeField":65,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"!"},{"codeField":"C","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"D","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"F","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"G","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"H","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"J","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"L","isAvailField":true,"seatCharacteristicsField":"*"}]},{"characteristicsField":"","codeField":66,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"!"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"!"},{"codeField":"D","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"F","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"G","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"H","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"J","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"L","isAvailField":true,"seatCharacteristicsField":"*"}]},{"characteristicsField":"","codeField":67,"seatsField":[{"codeField":"A","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"C","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"D","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"F","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"G","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"H","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"J","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"L","isAvailField":true,"seatCharacteristicsField":"*"}]},{"characteristicsField":"","codeField":68,"seatsField":[{"codeField":"A","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"C","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"D","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"F","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"G","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"H","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"J","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"L","isAvailField":true,"seatCharacteristicsField":"*"}]},{"characteristicsField":"","codeField":69,"seatsField":[{"codeField":"A","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"C","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"D","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"F","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"G","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"H","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"J","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"L","isAvailField":true,"seatCharacteristicsField":"*"}]},{"characteristicsField":"","codeField":70,"seatsField":[{"codeField":"A","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"C","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"D","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"F","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"G","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"H","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"J","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"L","isAvailField":true,"seatCharacteristicsField":"*"}]},{"characteristicsField":"","codeField":71,"seatsField":[{"codeField":"A","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"C","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"D","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"F","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"G","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"H","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"J","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"L","isAvailField":true,"seatCharacteristicsField":"*"}]},{"characteristicsField":"","codeField":72,"seatsField":[{"codeField":"A","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"C","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"D","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"F","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"G","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"H","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"J","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"L","isAvailField":true,"seatCharacteristicsField":"*"}]},{"characteristicsField":"","codeField":73,"seatsField":[{"codeField":"A","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"C","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"D","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"F","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"H","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"J","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"L","isAvailField":true,"seatCharacteristicsField":"*"}]},{"characteristicsField":"","codeField":74,"seatsField":[{"codeField":"A","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"C","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"D","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"F","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"H","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"J","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"L","isAvailField":true,"seatCharacteristicsField":"*"}]},{"characteristicsField":"","codeField":75,"seatsField":[{"codeField":"A","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"C","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"D","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"F","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"H","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"J","isAvailField":true,"seatCharacteristicsField":"*"},{"codeField":"L","isAvailField":true,"seatCharacteristicsField":"*"}]},{"characteristicsField":"","codeField":76,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":"X"}]},{"characteristicsField":"","codeField":77,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":" "}]},{"characteristicsField":"","codeField":78,"seatsField":[{"codeField":"A","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":" "},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":" "}]}]
     * wingRowEndNumberField : 0
     * wingRowStartNumberField : 0
     */

    private boolean defaultSeatAvailField;
    private int rowEndNumberField;
    private int rowStartNumberField;
    private int wingRowEndNumberField;
    private int wingRowStartNumberField;
    private List<ColumnsFieldBean> columnsField;
    private List<RowsFieldBean> rowsField;

    public boolean isDefaultSeatAvailField() {
        return defaultSeatAvailField;
    }

    public void setDefaultSeatAvailField(boolean defaultSeatAvailField) {
        this.defaultSeatAvailField = defaultSeatAvailField;
    }

    public int getRowEndNumberField() {
        return rowEndNumberField;
    }

    public void setRowEndNumberField(int rowEndNumberField) {
        this.rowEndNumberField = rowEndNumberField;
    }

    public int getRowStartNumberField() {
        return rowStartNumberField;
    }

    public void setRowStartNumberField(int rowStartNumberField) {
        this.rowStartNumberField = rowStartNumberField;
    }

    public int getWingRowEndNumberField() {
        return wingRowEndNumberField;
    }

    public void setWingRowEndNumberField(int wingRowEndNumberField) {
        this.wingRowEndNumberField = wingRowEndNumberField;
    }

    public int getWingRowStartNumberField() {
        return wingRowStartNumberField;
    }

    public void setWingRowStartNumberField(int wingRowStartNumberField) {
        this.wingRowStartNumberField = wingRowStartNumberField;
    }

    public List<ColumnsFieldBean> getColumnsField() {
        return columnsField;
    }

    public void setColumnsField(List<ColumnsFieldBean> columnsField) {
        this.columnsField = columnsField;
    }

    public List<RowsFieldBean> getRowsField() {
        return rowsField;
    }

    public void setRowsField(List<RowsFieldBean> rowsField) {
        this.rowsField = rowsField;
    }

    public static class ColumnsFieldBean {
        /**
         * codeField : A
         * descriptionField : 1
         */

        private String codeField;
        private int descriptionField;

        public String getCodeField() {
            return codeField;
        }

        public void setCodeField(String codeField) {
            this.codeField = codeField;
        }

        public int getDescriptionField() {
            return descriptionField;
        }

        public void setDescriptionField(int descriptionField) {
            this.descriptionField = descriptionField;
        }
    }

    public static class RowsFieldBean {
        /**
         * characteristicsField :
         * codeField : 31
         * seatsField : [{"codeField":"A","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"C","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"D","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"F","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"G","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"H","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"J","isAvailField":false,"seatCharacteristicsField":"X"},{"codeField":"L","isAvailField":false,"seatCharacteristicsField":"X"}]
         */

        private String characteristicsField;
        private int codeField;
        private List<SeatsFieldBean> seatsField;

        public String getCharacteristicsField() {
            return characteristicsField;
        }

        public void setCharacteristicsField(String characteristicsField) {
            this.characteristicsField = characteristicsField;
        }

        public int getCodeField() {
            return codeField;
        }

        public void setCodeField(int codeField) {
            this.codeField = codeField;
        }

        public List<SeatsFieldBean> getSeatsField() {
            return seatsField;
        }

        public void setSeatsField(List<SeatsFieldBean> seatsField) {
            this.seatsField = seatsField;
        }

        public static class SeatsFieldBean {
            /**
             * codeField : A
             * isAvailField : false
             * seatCharacteristicsField : X
             */

            private String codeField;
            private boolean isAvailField;
            private String seatCharacteristicsField;

            public String getCodeField() {
                return codeField;
            }

            public void setCodeField(String codeField) {
                this.codeField = codeField;
            }

            public boolean isIsAvailField() {
                return isAvailField;
            }

            public void setIsAvailField(boolean isAvailField) {
                this.isAvailField = isAvailField;
            }

            public String getSeatCharacteristicsField() {
                return seatCharacteristicsField;
            }

            public void setSeatCharacteristicsField(String seatCharacteristicsField) {
                this.seatCharacteristicsField = seatCharacteristicsField;
            }
        }
    }
}
