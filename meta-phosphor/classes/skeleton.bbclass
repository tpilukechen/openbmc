inherit obmc-phosphor-license

HOMEPAGE = "http://github.com/openbmc/skeleton"

SRCREV ??= "${AUTOREV}"
SRC_URI += "git://github.com/tpilukechen/skeleton"
S = "${WORKDIR}/git/${SKELETON_DIR}"
