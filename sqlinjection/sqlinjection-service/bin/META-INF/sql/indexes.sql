create index IX_860C2551 on COLOR_Color (colorName[$COLUMN_LENGTH:75$]);
create index IX_79CA1201 on COLOR_Color (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_6F0124C3 on COLOR_Color (uuid_[$COLUMN_LENGTH:75$], groupId);