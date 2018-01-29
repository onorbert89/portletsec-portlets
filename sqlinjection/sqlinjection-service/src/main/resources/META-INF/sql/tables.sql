create table COLOR_Color (
	uuid_ VARCHAR(75) null,
	colorid LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	colorName VARCHAR(75) null,
	colorCode VARCHAR(75) null
);