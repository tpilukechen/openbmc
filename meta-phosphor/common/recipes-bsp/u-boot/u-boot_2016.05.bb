require recipes-bsp/u-boot/u-boot.inc

LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
DEPENDS += "dtc-native"

SRCREV = "${AUTOREV}"
UBRANCH = "v2016.05-aspeed-openbmc"
SRC_URI = "git://git@github.com/tpilukechen/u-boot.git;branch=${UBRANCH};protocol=ssh"

PV = "v2016.05+git${SRCPV}"

EXTRA_OEMAKE_append = " KCFLAGS=-fgnu89-inline"
